package com.RSL.event.dao;

import org.springframework.data.repository.CrudRepository;
import com.RSL.event.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>
{
	public User findByMailAndPassword(String mail, String password);
}
