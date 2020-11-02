package pl.monikamisiewicz.garden.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.monikamisiewicz.garden.models.BloomTime;
import pl.monikamisiewicz.garden.repositories.BloomTimeRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BloomTimeService {

    private final BloomTimeRepository bloomTimeRepository;

    public List<BloomTime> getBloomTimes() {
        return bloomTimeRepository.findAll();
    }

    public void save(BloomTime bloomTime) {
        bloomTimeRepository.save(bloomTime);
    }

    public Optional<BloomTime> findById(long id) {
        return bloomTimeRepository.findById(id);
    }

    public void delete (Long id) {
        bloomTimeRepository.deleteById(id);
    }
}
