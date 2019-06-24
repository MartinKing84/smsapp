package com.mlsolution.sharehometools.dao;


import com.mlsolution.sharehometools.dao.entity.Tool;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolRepo extends CrudRepository<Tool, Long> {
}
