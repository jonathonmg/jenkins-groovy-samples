import nectar.plugins.rbac.groups.*;
import org.jenkinsci.plugins.workflow.multibranch.WorkflowMultiBranchProject;

for (i in Jenkins.instance.allItems(WorkflowMultiBranchProject.class)) {
    GroupContainer groupContainer = GroupContainerLocator.locate(i);
    println("${i.fullDisplayName}|${groupContainer.getUrl()}")
    for (group in groupContainer.getGroups()) {
      println("  ${group.getName()}")
    for (role in group.getRoles()) {
          println("    ${role}")
        }
    for (member in group.getMembership()) {
          println("${member.id}|${member.fullName}");
        }
    }
}