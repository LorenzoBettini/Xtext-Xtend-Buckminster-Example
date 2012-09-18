package org.xtext.example.hellobuck.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.hellobuck.HelloBuckInjectorProvider;

@RunWith(value = XtextRunner.class)
@InjectWith(value = HelloBuckInjectorProvider.class)
@SuppressWarnings("all")
public class HelloBuckCompilerTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  private ReflectExtensions _reflectExtensions;
  
  @BeforeClass
  public static void setNewLine() {
    System.setProperty("line.separator", "\n");
  }
  
  @Test
  public void testGeneratedJava() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello foo!");
    _builder.newLine();
    _builder.append("Hello bar!");
    _builder.newLine();
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            final Object obj = _compiledClass.newInstance();
            HelloBuckCompilerTest.this._reflectExtensions.invoke(obj, "hellofoo");
            Object _invoke = HelloBuckCompilerTest.this._reflectExtensions.invoke(obj, "hellofoo");
            Assert.assertEquals("Hello foo", _invoke);
          } catch (Exception _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
    this._compilationTestHelper.compile(_builder, new IAcceptor<Result>() {
        public void accept(Result t) {
          _function.apply(t);
        }
    });
  }
  
  @Test
  public void compareGeneratedJava() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello foo!");
    _builder.newLine();
    _builder.append("Hello bar!");
    _builder.newLine();
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("package greetings;");
          _builder.newLine();
          _builder.newLine();
          _builder.append("public class Greetings {");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("public String hellofoo() {");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("return \"Hello foo\";");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("}");
          _builder.newLine();
          _builder.append("  ");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("public String hellobar() {");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("return \"Hello bar\";");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("}");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          String _string = _builder.toString();
          String _generatedCode = it.getGeneratedCode();
          Assert.assertEquals(_string, _generatedCode);
        }
      };
    this._compilationTestHelper.compile(_builder, new IAcceptor<Result>() {
        public void accept(Result t) {
          _function.apply(t);
        }
    });
  }
}
