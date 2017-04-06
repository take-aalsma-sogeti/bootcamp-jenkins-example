click [here](../README.md) to go back to the main README. 

# Step 6 - Advanced Usage (DSL)

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

The last chapter we are going to unleash on you is some advanced use of Jenkins. In this course we have created Jobs manually and chained them together using a pipeline. However if you want to become the new Netflix you'll have to do better than that. Netflix designed DSL as a way to automate job creation. a DSL file is also written in the groovy Language and gives you the option to parameterize your jobs and create them on the fly while also chaining them in a "pipeline".

There is a lot of debate going on over [DSL vs Pipelines](http://stackoverflow.com/questions/37657810/job-dsl-plugin-vs-pipeline-plugin). because they are very much alike they can cause confusion on the [difference between DSL and Pipeline scripts](https://marcesher.com/2016/08/04/jenkins-as-code-comparing-job-dsl-and-pipelines/). You can check both links to form your own opinion on either or just check the [documentation](https://jenkinsci.github.io/job-dsl-plugin/)

The keen eye may have noticed a dsl.groovy file in the source code repository and we invite you to check it out and take a look at it to see what is happening. If you want even more complex usage on these files ask a question to Wouter van Eekelen as he showed this in the example of his business line.

Furthermore we would like to invite you to read this file into Jenkins and play with it. make changes, commit and experiment.

to read in the file follow these steps:

- Go back to your Jenkins Dashboard if not already there.
- Go to "New item". Enter "DSL File” as the item name and choose "Freestyle Project"
- Go to "Source code management" and select "Git". 
- Enter https://github.com/__username__/bootcamp-jenkins-example.git in the field "Repository URL".
- Make sure you use your own username
- Check that Branch specifies "*/Master"
- Go to "Build" and select "ADD BUILD STEP". Choose "Proces Job DSLs". 
- Select "Use the provided DSL Script"
- click "Save"
- ...
- .......
- Profit

So there you have it. Jenkins in a nutshell. Hopefully you'll be able to start using this at our customers or in your personal projects!

***
[Back to top](#table-of-contents)

click [here](../README.md#table-of-contents) to go back to the main README. 