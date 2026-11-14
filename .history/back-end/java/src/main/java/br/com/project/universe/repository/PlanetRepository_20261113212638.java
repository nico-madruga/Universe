package 

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.project.universe.entity.Planet;
import java.util.UUID;

public interface PlanetRepository extends JpaRepository<Planet, UUID>
{

}
