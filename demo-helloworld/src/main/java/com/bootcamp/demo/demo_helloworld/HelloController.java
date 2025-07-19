package com.bootcamp.demo.demo_helloworld;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.container.ContainerImageMetadata;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@ResponseBody
public class HelloController {
  @GetMapping(value = "/hello") // api endpoint
  public String helloworld() {
    return "Hello. Welcome to Spring Boot.";
  }

  // ! update URL, try again
  @GetMapping(value = "/goodbye")
  public String goodbye() {
    return "Goodbye.";
  }

  // ! create one more api, return cat project
  @GetMapping(value = "/cat")
  public Cat getCat() {
    return Cat.builder()
         .name("John")
         .age(13)
         .build();
  }
  // ! create one more api, return List<Cat> object
  @GetMapping(value = "/cats")
  public List<Cat> getCats() {
    return List.of(new Cat("John", 13), new Cat("Peter", 20));
  }
  
  // ! how about hashmap?
@GetMapping(value = "/catmap")
  public Map<String, List<Cat>> getCatMap() {
    List<Cat> catList1 = List.of(new Cat("John", 13), new Cat("Peter", 20));
    List<Cat> catList2 = List.of(new Cat("Mary", 10));
    Map<String, List<Cat>> catMap = new HashMap<>();
    catMap.put("ABC", catList1);
    catMap.put("IJK", catList2);
    return catMap;
  }
  // ! Return ShoppingMall
  @GetMapping(value = "/shoppingmall")
  public ShoppingMall getShoppingMall() {
    Film releasedFilm1 = new Film("ABC", "01-Jan-2025"); // or builder()
    Film releasedFilm2 = new Film("IJK", "12-Jan-2025"); // or builder()
    Cinema cinema = Cinema.builder().releaseFilms(List.of(releasedFilm1, releasedFilm2))
                    .openedDate("01-Jan-2025").name("ABC Cinema").build();
      return ShoppingMall.builder()
      .cinema(cinema)
      .area(100L)
      .name("K11")
      .shopCategories(List.of("Food","Sport"))
      .build();
  }
  
}
