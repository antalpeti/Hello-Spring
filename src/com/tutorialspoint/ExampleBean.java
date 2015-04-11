package com.tutorialspoint;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean implements InitializingBean, DisposableBean {
  public void init() {
    // do some initialization work
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    // do some initialization work
  }

  @Override
  public void destroy() throws Exception {
    // do some destruction work
  }

  public void dest() {
    // do some destruction work
  }
}
