package me.namila.RESTSpringTest.Controller;


import me.namila.RESTSpringTest.Exception.ResourceNotFoundException;
import me.namila.RESTSpringTest.Model.AbstractEntity;
import me.namila.RESTSpringTest.Results.ResponseWrapper;
import me.namila.RESTSpringTest.Service.MainService;
import me.namila.RESTSpringTest.dto.PageDto;
import me.namila.RESTSpringTest.dto.PaginateDto;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import javax.transaction.Transactional;

public abstract class AbstractController<E extends AbstractEntity, S extends MainService<E>> implements CommonController<E> {
    private final S service;

    protected AbstractController(S service) {
        this.service = service;
    }

    @GetMapping(value = "/")
    public ResponseWrapper findAll(@RequestBody PaginateDto  paginate) {
        if (paginate.equals(null))
            paginate = new PaginateDto();
        try {
            return new ResponseWrapper(service.findAll(paginate),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseWrapper(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping(value = "/{id}")
    public ResponseWrapper getById(@PathVariable Long id) {
        try {
            if (!service.exists(id)) throw new ResourceNotFoundException("Not found for this id: " + id);
            E item = service.getById(id);
            return new ResponseWrapper(item,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseWrapper(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/create")
    @Transactional
    public ResponseWrapper create(@RequestBody E item) {
        try {
            return new ResponseWrapper(service.add(item),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseWrapper(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/{id}")
    @Transactional
    public ResponseWrapper delete(@PathVariable Long id) {
        try {
            if (!service.exists(id)) throw new ResourceNotFoundException("Not found for this id: " + id);
            service.deleteById(id);
            return new ResponseWrapper(id,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseWrapper(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/{id}")
    @Transactional
    public    ResponseWrapper  update(@PathVariable Long id, @RequestBody E item) {
        try {
            if (!service.exists(id)) throw new ResourceNotFoundException("Not found for this id: " + id);
            return new ResponseWrapper(service.update(item,id),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseWrapper(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}