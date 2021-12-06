package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import model.Club;
import service.ClubService;

import java.util.List;

@RequestMapping("apiClub/v1")
@RestController
public class ClubController {

    private final ClubService clubService;

    @Autowired
    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping("/clubes")
    public List<Club> getClubes(){
        return clubService.getClubes();
    }

    @PostMapping("/addClub")
    public Club createClub(@RequestBody Club club){
        return clubService.createClub(club);
    }

    @DeleteMapping("/deleteClub/{id}")
    public void deleteClub(@PathVariable Integer id){
        clubService.deleteClub(id);
    }

    @PutMapping("/updateClub")
    public Club updateClub(@RequestBody Club club){
        return clubService.updateClub(club);
    }
}