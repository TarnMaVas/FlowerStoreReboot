package ua.edu.ucu.apps.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.edu.ucu.apps.flower.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Long> {
}
