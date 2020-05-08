package kg.securityexam.service;

import kg.securityexam.entity.Cinema;
import kg.securityexam.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;
    @Override
    public Cinema create(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }
}
