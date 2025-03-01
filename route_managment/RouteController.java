package me.asunamyadmin.air_plan_microservice.route_managment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController("/api/routes")
public class RouteController {
    @Autowired
    RoutesRepository routesRepository;

    @GetMapping
    public List<Route> getRoutes() {
        return routesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Route getRouteById(@PathVariable int id) {
        return routesRepository.findById(id).orElse(null);
    }

    @PostMapping("/add")
    public boolean addRoute( Route route) {
        if (routesRepository.existsById(route.getId())) {
            return false;
        }
        routesRepository.save(route);
        return true;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRouteById(@PathVariable int id) {
        routesRepository.deleteById(id);
    }
}
