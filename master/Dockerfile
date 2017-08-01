FROM jenkinsci/jenkins:2.60.2-alpine

ENV JAVA_OPTS="-Xmx4096m"
ENV JENKINS_SLAVE_AGENT_PORT=50000
ENV JENKINS_ADMIN_USERNAME=admin
ENV JENKINS_ADMIN_PASSWORD=admin

COPY security.groovy /usr/share/jenkins/ref/init.groovy.d/security.groovy
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

# Disable the upgrade wizard
RUN echo -n 2.0 > /usr/share/jenkins/ref/jenkins.install.UpgradeWizard.state  && \
    echo -n 2.0 > /usr/share/jenkins/ref/jenkins.install.InstallUtil.lastExecVersion

USER jenkins
