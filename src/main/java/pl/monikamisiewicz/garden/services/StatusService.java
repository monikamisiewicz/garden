package pl.monikamisiewicz.garden.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.monikamisiewicz.garden.models.BloomTime;
import pl.monikamisiewicz.garden.models.Category;
import pl.monikamisiewicz.garden.models.Status;
import pl.monikamisiewicz.garden.repositories.BloomTimeRepository;
import pl.monikamisiewicz.garden.repositories.StatusRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StatusService {

    private final StatusRepository statusRepository;

    public List<Status> getStatuses() {
        return statusRepository.findAll();
    }

    public void save(Status status) {
        statusRepository.save(status);
    }

    public Optional<Status> findById(long id) {
        return statusRepository.findById(id);
    }

    public void delete(Long id) {
        statusRepository.deleteById(id);
    }

}
