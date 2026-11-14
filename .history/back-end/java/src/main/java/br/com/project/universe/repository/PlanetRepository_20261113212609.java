import org.springframework.data.jpa.repository.JpaRepository;
import br.com.project.universe.entity.Planer;

public interface PlanetRepository extends JpaRepository<Planet, UUID>
{

}
