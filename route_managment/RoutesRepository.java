package me.asunamyadmin.air_plan_microservice.route_managment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutesRepository extends JpaRepository<Route, Integer> {
}
