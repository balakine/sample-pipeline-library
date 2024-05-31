import hudson.model.Job
import jenkins.model.Jenkins

def call() {
    def jobs = Jenkins.get().getItems(Job.class)
    jobs.each {
        echo it.name
    }
}
