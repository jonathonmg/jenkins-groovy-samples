Jenkins.getInstance().getAllItems(FreeStyleProject.class).findAll{
	job -> !job.properties.values().any{
		prop -> prop instanceof com.cloudbees.hudson.plugins.modeling.impl.jobTemplate.JobPropertyImpl
	}
}.each() {
	println it.fullName
}


Jenkins.getInstance().getAllItems(hudson.maven.MavenModuleSet.class).findAll{
	job -> !job.properties.values().any{
		prop -> prop instanceof com.cloudbees.hudson.plugins.modeling.impl.jobTemplate.JobPropertyImpl
	}
}.each(){
	println it.fullName
}
return;
