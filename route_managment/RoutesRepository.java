package me.asunamyadmin.air_plan_microservice.route_managment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutesRepository extends JpaRepository<Route, Integer> {
}
