## Deploying the servlet

After the war file is generated by the Makefile 'package' target, it
will be outputted to the WEB\_APOLLO\_DIR/target directory (e.g. target/apollo-1.0.war)
This WAR file can be copied into the tomcat7 webapps directory:

    cp WEB_APOLLO_DIR/target/apollo-1.x.war TOMCAT_WEBAPPS_DIR/WebApollo.war

We recommend not touching the WAR file contents or unzipping it manually after it has
been copied. The configuration and contents of the WAR should be finalized before deployment to avoid
data loss during Tomcat Undeploy operations (which will delete contents of the WAR, and will even delete the contents of the symlinked folders as well)

## Accessing your WebApollo installation

After copying your WAR file to the tomcat webapps directory, the app
will be automatically started. Let's test out our installation. Point
your browser to

    http://SERVER_ADDRESS:8080/WebApollo

The user name and password from our setup is normally `web_apollo_admin` or whatever was configured
earlier. Enter them into the login dialog.

Once the page is ready, we only see one reference sequence (scaffold) to annotate since we're only working
with a small example. Click on `scf1117875582023` under the `Name` column to be taken to the genome browser.

Now have fun annotating!!!
