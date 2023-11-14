package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.Staff;
import com.example.carrentalheadquarters.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public List<Staff> list(){
        return staffRepository.findAll();
    }

    public Staff get(Integer id){
        Optional<Staff> staffOptional = staffRepository.findById(id);
        if(staffOptional.isPresent()){
            return staffOptional.get();
        }
        else{
            return null;
        }
    }

    public Staff save(Staff staff){
        return staffRepository.save(staff);
    }

    public Staff update(Integer id, Staff staff){
        Optional<Staff> staffOptional = staffRepository.findById(id);
        if(staffOptional.isEmpty()){
            return null;
        }
        else{
            Staff existingStaff = staffOptional.get();
            existingStaff.setName(staff.getName());
            existingStaff.setPhone(staff.getPhone());
            existingStaff.setAddress(staff.getAddress());
            existingStaff.setUsername(staff.getUsername());
            existingStaff.setPassword(staff.getPassword());
            existingStaff.setIsmanagement(staff.isIsmanagement());
            existingStaff.setShop(staff.getShop());
            return staffRepository.save(existingStaff);
        }
    }

    public void delete(Integer id){
        staffRepository.deleteById(id);
    }
}
