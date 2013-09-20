package org.xtext.example.hellobuck.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.hellobuck.HelloBuckInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(HelloBuckInjectorProvider.class)
@SuppressWarnings("all")
public class HelloBuckCompilerTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  @BeforeClass
  public static void setNewLine() {
    System.setProperty("line.separator", "\n");
  }
  
  @Test
  public void testGeneratedJava() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello foo!");
      _builder.newLine();
      _builder.append("Hello bar!");
      _builder.newLine();
      final IAcceptor<Result> _function = new IAcceptor<Result>() {
        public void accept(final Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            final Object obj = _compiledClass.newInstance();
            HelloBuckCompilerTest.this._reflectExtensions.invoke(obj, "hellofoo");
            Object _invoke = HelloBuckCompilerTest.this._reflectExtensions.invoke(obj, "hellofoo");
            Assert.assertEquals("Hello foo", _invoke);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void compareGeneratedJava() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello foo!");
      _builder.newLine();
      _builder.append("Hello bar!");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package greetings;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("@SuppressWarnings(\"all\")");
      _builder_1.newLine();
      _builder_1.append("public class Greetings {");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public String hellofoo() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return \"Hello foo\";");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("public String hellobar() {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("return \"Hello bar\";");
      _builder_1.newLine();
      _builder_1.append("  ");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
