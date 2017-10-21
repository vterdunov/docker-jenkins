import hudson.model.*
import jenkins.model.*
import java.util.logging.Logger


Logger logger = Logger.getLogger("")
logger.info("Disabling master executors...")

Jenkins.instance.setNumExecutors(0)
