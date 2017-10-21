import jenkins.model.Jenkins
import java.util.logging.Logger

Logger logger = Logger.getLogger("")
logger.info("Disabling the Jenkins CLI...")

jenkins.model.Jenkins.instance.getDescriptor("jenkins.CLI").get().setEnabled(false)
