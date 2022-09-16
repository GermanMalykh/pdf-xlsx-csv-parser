import com.fasterxml.jackson.databind.ObjectMapper;

import domain.Person;
import org.junit.jupiter.api.*;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonParserTest {

    ClassLoader classLoader = JsonParserTest.class.getClassLoader();

    @DisplayName("Checking File Values")
    @Test
    void parseJsonTest() throws IOException {

        String jsonFileName = "Person.json",
                name = "Luke Skywalker",
                hairColor = "blond",
                eyeColor = "blue",
                skinColor = "fair",
                birthYear = "19BBY",
                gender = "male";

        int height = 172,
                mass = 77;

        String[] filmsList = new String[]{
                "A New Hope",
                "The Empire Strikes Back",
                "Return of the Jedi",
                "The Last Jedi",
                "The Rise of Skywalker"};

        try (InputStream stream = classLoader.getResourceAsStream(jsonFileName)) {
            ObjectMapper objectMapper = new ObjectMapper();
            Person person = objectMapper.readValue(stream, Person.class);
            assertThat(person.getName()).isEqualTo(name);
            assertThat(person.getHeight()).isEqualTo(height);
            assertThat(person.getMass()).isEqualTo(mass);
            assertThat(person.getHairColor()).isEqualTo(hairColor);
            assertThat(person.getSkinColor()).isEqualTo(skinColor);
            assertThat(person.getEyeColor()).isEqualTo(eyeColor);
            assertThat(person.getBirthYear()).isEqualTo(birthYear);
            assertThat(person.getGender()).isEqualTo(gender);
            assertThat(person.getFilms()).isEqualTo(filmsList);
        }
    }

}