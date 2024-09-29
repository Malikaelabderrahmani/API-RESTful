package com.example.api.ApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.ApiModel.Student;
import com.example.api.ApiService.StudentService;

@RestController
@RequestMapping("/Std")
public class StudentController {
    @Autowired
    private StudentService StdSer;
    @PostMapping("/Add/{cne}/{nom}/{prenom}/{date_nais}/{sexe}/{pass_hash}")
    public Student AddEtd(@PathVariable String cne, @PathVariable String nom, @PathVariable String prenom,
                    @PathVariable String date_nais, @PathVariable String sexe, @PathVariable String pass_hash) {
                    return StdSer.AddStd(cne, nom, prenom, date_nais, sexe, pass_hash);
    }
    @GetMapping("Get/{cne}")
    public Student GetEtd(@PathVariable String cne) {
        return StdSer.GetStdById(cne);
    }
}
