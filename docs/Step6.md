click [here](../README.md) to go back to the main README. 

# Step 6 - Advanced Usage (DSL)

# Table of Contents
- [Introduction](#introduction)
- [Proces DSL Script](#proces-dsl-script)
- [Summary](#summary)

***

# Introduction

The last chapter we are going to unleash on you is some advanced use of Jenkins. In this course we have created Jobs manually and chained them together using a pipeline. However if you want to become the new Netflix you'll have to do better than that. Netflix designed DSL as a way to automate job creation. a DSL file is also written in the groovy Language and gives you the option to parameterize your jobs and create them on the fly while also chaining them in a "pipeline".

There is a lot of debate going on over [DSL vs Pipelines](http://stackoverflow.com/questions/37657810/job-dsl-plugin-vs-pipeline-plugin). because they are very much alike they can cause confusion on the [difference between DSL and Pipeline scripts](https://marcesher.com/2016/08/04/jenkins-as-code-comparing-job-dsl-and-pipelines/). You can check both links to form your own opinion on either or just check the [documentation](https://jenkinsci.github.io/job-dsl-plugin/)

The keen eye may have noticed a dsl.groovy file in the source code repository and we invite you to check it out and take a look at it to see what is happening. If you want even more complex usage on these files ask a question to Wouter van Eekelen as he showed this in the example of his business line.

Furthermore we would like to invite you to read this file into Jenkins and play with it. make changes, commit and experiment.

# Proces DSL Script

to read in the file follow these steps:

- Go back to your Jenkins Dashboard if not already there.
- Go to "New item". Enter "DSL File” as the item name and choose "Freestyle Project"

![alt text](/docs/images/Step6/Step6-1.png "Logo Title Text 1")

- Go to "Source code management" and select "Git". 
- Enter https://github.com/__username__/bootcamp-jenkins-example.git in the field "Repository URL".
- Make sure you use your own username
- Check that Branch specifies "*/Master"
- Go to "Build" and select "ADD BUILD STEP". Choose "Proces Job DSLs". 

![alt text](/docs/images/Step6/Step6-3.png "Logo Title Text 1")

- Select "Look on Filesystem" and enter dsl.groovy
- click "Save"
- take a look at your current Dashboard

![alt text](/docs/images/Step6/Step6-4.png "Logo Title Text 1")

- run the job and notice it failing for security reasons

![alt text](/docs/images/Step6/Step6-4a.png "Logo Title Text 1")

- in manage jenkins go to "In Progress Script Approval" and approve the groovy script

![alt text](/docs/images/Step6/Step6-4b.png "Logo Title Text 1")

- Run the job and watch in awe

![alt text](/docs/images/Step6/Step6-5.png "Logo Title Text 1")

- look at your Dashboard after the run

![alt text](/docs/images/Step6/Step6-6.png "Logo Title Text 1")

It looks like we created all the jobs and pipeline in one go with just one simple script. Notice how we didnt configure any triggers. These can ofcourse be scripted in the DSL script like we did in the manual excercise by using the __trigger{}__ syntax:

````
triggers {
        scm('H/15 * * * *')
    }
````

This configures a polling request every 15 mins.


## Artifacts

Artifacts are an endresult of a compile / build action like an *.exe / *.jar / *.dacpac etc. If you closesly you will see that the job in step 6 has produced a *.jar artifact in the code:

````
archiveArtifacts('target/*.jar')
````

this can be found in the folder __$JENKINS_HOME/jobs/<job>/builds/<build>/archive__

These can ofcourse be used in other steps. How? thats something to find out yourself.

# Summary

## So to summarize our Bootcamp:

1. __Start using Jenkins__
2. __?__
3. __Profit__

So there you have it. Jenkins in a nutshell. Hopefully you'll be able to start using this at our customers or in your personal projects!

***
[Back to top](#table-of-contents)

click [here](../README.md#table-of-contents) to go back to the main README. 