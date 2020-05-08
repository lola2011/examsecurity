package kg.securityexam.service;

import kg.securityexam.entity.Restaraunt;
import kg.securityexam.repository.RestarauntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestarauntServiceImpl implements RestarauntService {
    @Autowired
    private RestarauntRepository restarauntRepository;
    @Override
    public Restaraunt create(Restaraunt restaraunt) {
        return restarauntRepository.save(restaraunt);
    }
}
