akka-docker-cluster-example
===========================

An example akka-cluster project with Docker support. See [the blog post](http://blog.michaelhamrah.com/2014/11/clustering-akka-applications-with-docker-version-3/). Uses [SBT Native Packager](https://github.com/sbt/sbt-native-packager).

### How to run

In SBT, run `docker/publishLocal` to create a local docker container. 

To run the cluster, run `docker-compose -f docker-compose-akka-cluster.yml up -d`. This will create 3 nodes, a seed and two regular members, called `seed`, `c1`, and `c2` respectively.

While running, try opening a new terminal and (from the same directory) try things like `docker-compose stop seed` and watch the cluster nodes respond.
