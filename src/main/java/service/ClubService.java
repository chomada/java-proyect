package service;
import model.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.ClubRepository;
import java.util.List;

@Service
public class ClubService {
	
	private final ClubRepository clubRepository;
		
	@Autowired
	public ClubService(ClubRepository clubRepository) {
		this.clubRepository = clubRepository;
	}
	public List<Club>getClubes() {
		return clubRepository.findAll();
	}
	public Club createClub(Club club) {
        return clubRepository.save(club);
    }

    public void deleteClub(Integer id) {
    	clubRepository.deleteById(id);
    }

    public Club updateClub(Club club) {
        return clubRepository.save(club);
    }
}
