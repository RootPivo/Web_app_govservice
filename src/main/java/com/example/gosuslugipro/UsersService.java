package com.example.gosuslugipro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UsersService {
    @Autowired
    private UsersRepo repo;
    public List<Users> listAll(String keyword) {if (keyword != null) {return repo.search(keyword);}return repo.findAll();}
    public void save(Users users) {this.repo.save(users);}
    public Users findById(Integer id) {return this.repo.findById(id).get();}
    public void deleteById(int id) {this.repo.deleteById(id);}}
