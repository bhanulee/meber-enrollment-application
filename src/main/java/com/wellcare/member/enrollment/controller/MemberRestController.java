package com.wellcare.member.enrollment.controller;



import java.util.List;

import com.wellcare.member.enrollment.model.Member;
import com.wellcare.member.enrollment.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "/model-enrollment", produces = { MediaType.APPLICATION_JSON_VALUE })
@RequestMapping("//")
public class MemberRestController{

    @Autowired
    private MemberRepository repository;

    public MemberRepository getRepository() {
        return repository;
    }

    public void setRepository(MemberRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/members")
    public List<Member> getAllMembers() {
        return repository.findAll();
    }

    @PostMapping("/members")
    Member createOrSaveMember(@RequestBody Member newMember) {
        return repository.save(newMember);
    }

    @GetMapping("/members/{id}")
    Member getMemberById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PutMapping("/members/{id}")
    Member updateMember(@RequestBody Member newMember, @PathVariable Long id) {

        return repository.findById(id).map(member -> {
            member.setName(newMember.getName());
            member.setDob(newMember.getDob());
            member.setStatus(newMember.getStatus());
            return repository.save(member);
        }).orElseGet(() -> {
            newMember.setId(id);
            return repository.save(newMember);
        });
    }

    @DeleteMapping("/members/{id}")
    void deleteMember(@PathVariable Long id) {
        repository.deleteById(id);
    }

}