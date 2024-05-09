# Introduction

DevOps[[1]](https://pt.wikipedia.org/wiki/DevOps) is a set of practices that integrates and automates the work of software development (Dev) and IT operations (Ops). However, it faces challenges choosing the right technologies and language for various tasks. Model-driven engineering (MDE) offers a solution by providing high-level abstractions and models to facilitate the development, integration, and deployment of the DevOps pipeline across diverse technological landscapes.

This assignment aims to create a metamodel for the DevOps pipeline. In short, our DevOps pipeline design was to maintain a source code repository (SourceRepo) that can do various actions (Jobs with Actions); actions can be Integrating, Deploying, CountinuousDelivery, and MonitoringAndLogging. The following sections will provide more details about these actions, along with explanations of the work's inspirations and the concept of the language.

After finalizing the modeling domain analysis, we implement it in the EMF framework, which you can find in the repository in the Project folder. This implementation allows the functionality of our pipelines to be executable, visualizable, and testable.

# Metamodel

In this section, we will describe the details of our metamodel of the DevOps pipeline.

## Modeling Concept Table of DevOps Pipelines

The [modeling concept tables](Modeling_Concept_Table.md) list the language concepts, including the attributes and connections between concepts we define for our DevOps Pipeline metamodel.

## Inspiration

In building our DevOps tool, we looked closely at existing products, such as [[2]](https://www.redhat.com/en/blog/intro-devops), [[3]](https://www.redhat.com/en/topics/devops), [[4]](https://opensource.com/article/19/4/devops-pipeline), [[5]](https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions), [[6]](https://learn.microsoft.com/en-us/azure/devops/pipelines/get-started/key-pipelines-concepts?view=azure-devops), [[7]](https://www.jenkins.io/doc/book/pipeline/), to see how they were structured and what worked well. These products guided our decisions and provided valuable insights into best practices.

One common theme we noticed across various projects was the importance of "modularity" and "scalability." To make our setup versatile and suitable for different scenarios and use cases, we created a universal 'action' that can serve various purposes and be easily integrated into different pipeline setups.

We also aimed to keep things user-friendly while ensuring completeness, as this eases integration with other projects. We identified distinct areas where DevOps pipelines were put to use and organized our project accordingly:

1. **Automating Deployment:**

   - _How we did it:_ In the "Delivering" class, we focused on automating tasks by simplifying artifact promotion and deployment processes. We automated these tasks by setting up a series of predefined actions that kick in automatically once earlier stages are finished.

2. **Provisioning Infrastructure:**

   - _How we did it:_ In the "Deploying" class, we automated infrastructure provisioning through scripts and configuration files. This ensured that the necessary infrastructure was ready for application deployment.

3. **Deploying Applications:**

   - _How we did it:_ Within the "Deploying" class, we included application deployment methods. These methods executed predefined deployment scripts, making the process straightforward.

4. **Feedback System:**
   - _How we did it:_ Our architecture incorporated a feedback system to provide effective notifications and alerts about the pipeline's status. This system helps users identify and address issues with the project or pipeline.

Although straightforward, these criteria guided us in creating a flexible and transparent structure for our project.

## OCL

OCL was used to force the format of strings containing URLs, computer paths, and script files. This was achieved with the use of regex patterns in the following manner:

``` 
invariant
ValidIncidentManagementUrl: self.incidentManagementUrls->isEmpty() or (self.incidentManagementUrls.matches('(?:https?:\\/\\/[^\\/\\n]+(?:\\/[^\\/\\n]*)*)'));
```

# Conclusion

In conclusion, with this assignment, we get more knowledgeable about DevOps and, essentially, MDE by creating and studying domain models.
We achieved the objective of producing a metamodel for the DevOps pipeline, ensuring our model can adapt to different situations.

# References

[1] https://pt.wikipedia.org/wiki/DevOps
<br>[2] https://www.redhat.com/en/blog/intro-devops
<br>[3] https://www.redhat.com/en/topics/devops
<br>[4] https://opensource.com/article/19/4/devops-pipeline
<br>[5] https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions
<br>[6] https://learn.microsoft.com/en-us/azure/devops/pipelines/get-started/key-pipelines-concepts?view=azure-devops
<br>[7] https://www.jenkins.io/doc/book/pipeline/
