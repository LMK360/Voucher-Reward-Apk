bash
#!/usr/bin/env sh

##############################################################################
Gradle start up script for UN*X
##############################################################################

DIR="(cd "(dirname "0")"        pwd)"
DEFAULT_JVM_OPTS=""
JAVA_CMD="java"

exec "JAVA_CMD" DEFAULT_JVM_OPTS -classpath "DIR/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
