package com.aconso.workshop.demo;

import javax.annotation.security.DeclareRoles;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.eclipse.microprofile.auth.LoginConfig;

/**
 * Demo Rest Application to get infos about the workshop
 */
@ApplicationPath("/data")
@ApplicationScoped
@LoginConfig(authMethod = "MP-JWT", realmName = "myrealm")
@DeclareRoles({"user", "admin"})
public class DemoRestApplication extends Application {
}
