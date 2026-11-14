import org.springframework.data.jpa.repository.JpaRepository;
import br.com.project.universe.entity.Planet;

public interface PlanetRepository extends JpaRepository<Planet, UUID>
{

}
