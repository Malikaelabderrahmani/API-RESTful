package com.example.api.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.ApiModel.Student;
import com.example.api.ApiRepo.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository StdRepo;
    public Student AddStd(String cne, String nom, String prenom, String date_nais, String sexe, String pass_hash) {
        Student std1 = new Student();
        std1.setCne(cne);
        std1.setNom(nom);
        std1.setPrenom(prenom);
        std1.setDate_nais(date_nais);
        std1.setSexe(sexe);
        std1.setPass_hash(pass_hash);
        return StdRepo.save(std1);
    }
    public Student GetStdById(String cne) {
        return StdRepo.findById(cne).orElse(null);
    }
}
