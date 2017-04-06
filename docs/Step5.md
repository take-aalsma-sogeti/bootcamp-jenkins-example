click [here](../README.md) to go back to the main README. 

# Step 5 - Create pipeline with all jobs

# Table of Contents
- [Introduction](#introduction)
- [Build Triggers (or Scheduling)](#run-deployment-job)
  - [Upstream Trigger on Git to start the "Checkout Code" Job]()
  - [Upstream Trigger on our pipeline (built later) to watch when "Checkout Code" has finished]()
- [Manual Pipeline](#configure-mail)
- [Jenkinsfile Pipeline](#configure-mail)

  - [Gmail Two Factor Authentication](#two--factor-authentication)
- [Re-run Job](#rerun-job)

***

# Introduction

In this step we are introducing two topics:

- Build (job) Triggers
- Chaining Jobs / Projects in a pipeline.

Here we get to the nitty gritty of things. In the past 4 steps we created the separate jobs we use in our Continuous Integration cycle. There's one caveat thought. As a developer or ops you don't have time to start each job whenever you process a commit on your code.

As Jenkins is an Automation tool after all we would like to proces all these job at once, preferably when new code is committed to the repository or in Daily / Nightly builds.

# Build Triggers (or Scheduling)

Build Triggers are important in automation because they initiate the first step in kicking off a chain of jobs or a pipeline.

In jenkins there are three types of triggers:

- Build Trigger -> available in a Job / pipeline to specify when the build step should start
- Post Build Actions -> Avaliable in a Job only and specifies a follow-up action after build has taken place (see Step5).

# kan iemand dit controleren???

In our bootcamp we will build two triggers:

- Upstream Trigger on Git to start the "Checkout Code" Job
- Upstream Trigger on our pipeline (built later) to watch when "Checkout Code" has finished

__note on terminology: Upstream is when a project / Pipeline executes a separate Project / Pipeline as part of its execution whereas a Downstream trigger is the Executed Project / Pipeline from another Project / Pipeline.__

#graag even nakijken of deze klopt!!

## Upstream Trigger on Git to start the "Checkout Code" Job

In order for the trigger to work we need to reconfigure our "Code Checkout" Job

- Open the "Code Checkout" Job
- Go to the tab "Build triggers"

![alt text](/docs/images/Step5/Step5-bt-1.png "Logo Title Text 1")

- Select "Poll SCM" and Enter "* * * * *" as Value. This will poll SCM every minute. If you want a different value use another [CRON Expression](https://en.wikipedia.org/wiki/Cron)
- Click "Save"

A better way to trigger this job is to listen to Git Commits done when Git pushes the Git Command. This Requires the Git Plugin version 1.1.14 and an alteration to your local git. [Use this guide](http://kohsuke.org/2011/12/01/polling-must-die-triggering-jenkins-builds-from-a-git-hook/) to set it up. Use at your own risk!

![alt text](/docs/images/Step5/Step5-bt-2.png "Logo Title Text 1")

Try your new trigger by pushing code to the remote repository and see if the "Code Checkout" job starts.

## Upstream Trigger on our pipeline (built later) to watch when "Checkout Code" has finished

We will configure this during the construction of our Pipeline.

# Manual Pipeline

Constructing Pipelines in jenkins is done in the Groovy language and stored in a __Jenkinsfile__ which is to be stored in the code repository so it can be used upon code checkout.

A jenkinsfile will follow a set of instructions to configure Stages, Steps, Parameters etc.

The jenkinsfile starts with a __pipeline{}__ command along with the specification of a specific or any agent.

```
#!groovy

pipeline {
    agent any

}
``` 
Within this syntax follow various __stages{}__ , __stage('name'){}__  and __steps{}__ commands to specify what needs to be done in the pipeline.

We are going to create our first "Manual Pipeline" Pipeline.

- Go back to your Jenkins Dashboard if not already there.
- Go to "New item". Enter “Manual Pipeline” as the item name and choose "Pipeline"

![alt text](/docs/images/Step5/Step5-1.png "Logo Title Text 1")

![alt text](/docs/images/Step5/Step5-2.png "Logo Title Text 1")

- in The Build Triggers tab check "Build after other projects are built" and choose "Code Checkout"

![alt text](/docs/images/Step5/Step5-3.png "Logo Title Text 1")

You can play with the check marks to see the difference.

- in the Pipeline tab under Definition select "Pipeline Script"

![alt text](/docs/images/Step5/Step5-4.png "Logo Title Text 1")

- write code to create a pipeline with the 3 remaining stages (steps) with each one step using the "build job:'name'" command.
- click "Save"

need help creating pipeline syntax?

either click on pipeline syntax in the configure screen or check this link: http://localhost:8080/job/Manual%20Pipeline/pipeline-syntax/

Push a change to your Remote repo to fire off the "Code Checkout" job which will start the pipeline for the remaining

go to the pipeline and select "Stage view" to get a visual representation of the view.

![alt text](/docs/images/Step5/Step5-5.png "Logo Title Text 1")


# Jenkinsfile Pipeline

to further automate the building process specific to the code you want to automate we may want to run different jobs or in a different order.

- The code you have written could be saved in a __"Jenkinsfile"__ and stored along with the rest of the code. an Empty example can be found in the Sourcecode folder.
- Go back to your Jenkins Dashboard if not already there.
- Go to "New item". Enter "Jenkinsfile Pipeline” as the item name and choose "Pipeline"
- to use this script in the pipeline select "pipeline script from SCM" in the pipeline

![alt text](/docs/images/Step5/Step5-jf-1.png "Logo Title Text 1")

- add the git remote repository
- Select the appropriate branch
- In path leave the setting to Jenkinsfile to search the root of the repository

If you are having troubles getting your Jenkinsfile working you can point the SCM to "*/step5"

![alt text](/docs/images/Step5/Step5-jf-2.png "Logo Title Text 1")

Have a look at that super shiny awesome looking pipeline you just created. yes.... you may pat yourself on the back ^^

***
[Back to top](#table-of-contents)

click [here](../README.md#table-of-contents) to go back to the main README. 