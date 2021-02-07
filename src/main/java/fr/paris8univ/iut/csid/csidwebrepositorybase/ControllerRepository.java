package fr.paris8univ.iut.csid.csidwebrepositorybase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/repositories")
public class ControllerRepository {
    private final List<Repository> repositories;
    private final ServiceRepository serviceRepository;

    @Autowired
    public ControllerRepository(ServiceRepository serviceRepository){
        repositories = new ArrayList<>();
        this.serviceRepository = serviceRepository;
    }

    @PostMapping("/{repository}/issues")
    public void postIssue(@PathVariable String repository, @RequestBody Issue issue){
        serviceRepository.postIssue(issue, repository);
    }

}
