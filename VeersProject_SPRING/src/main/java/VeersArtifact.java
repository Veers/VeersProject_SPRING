import com.veers.model.beans.StandaloneVO;
import com.veers.model.dao.StandaloneDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class VeersArtifact {
    public static void main(final String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        VeersArtifact standalone = ctx.getBean(VeersArtifact.class);
        standalone.startStandalone();
    }

    private void startStandalone() {
        StandaloneVO standaloneVO = new StandaloneVO();
        standaloneVO.setName("Test1");
        standaloneVO.setAmount(239.32);
        standaloneVO.setCreated(new Date());
    }
}
