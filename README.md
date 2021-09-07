# test-app

```xml
<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
				<configuration>
					<source>11</source>
					<target>11</target>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-jar-plugin</artifactId>
				<version>3.2.0</version>
				<configuration>
					<archive>
						<manifest>
							<addDefaultImplementationEntries>true</addDefaultImplementationEntries>
							<addDefaultSpecificationEntries>true</addDefaultSpecificationEntries>
						</manifest>
					</archive>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-source-plugin</artifactId>
				<version>3.2.1</version>
				<executions>
					<execution>
						<goals>
							<goal>jar</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<artifactId>maven-assembly-plugin</artifactId>
				<configuration>
				  <archive>
					<manifest>
					  <mainClass>com.mycloud.WidgetConsumer</mainClass>
					</manifest>
				  </archive>
				  <!-- <appendAssemblyId>false</appendAssemblyId> -->
				  <descriptorRefs>
					<descriptorRef>jar-with-dependencies</descriptorRef>
				  </descriptorRefs>
				</configuration>
				<executions>
				  <execution>
					<id>make-assembly</id> <!-- this is used for inheritance merges -->
					<phase>package</phase> <!-- bind to the packaging phase -->
					<goals>
					  <goal>single</goal>
					</goals>
				  </execution>
				</executions>
			  </plugin>
```

bumped