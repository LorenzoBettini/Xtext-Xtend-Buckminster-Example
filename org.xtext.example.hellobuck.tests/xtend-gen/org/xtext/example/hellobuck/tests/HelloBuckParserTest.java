package org.xtext.example.hellobuck.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.hellobuck.HelloBuckInjectorProvider;
import org.xtext.example.hellobuck.helloBuck.Model;

@RunWith(value = XtextRunner.class)
@InjectWith(value = HelloBuckInjectorProvider.class)
@SuppressWarnings("all")
public class HelloBuckParserTest {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @BeforeClass
  public static void setNewLine() {
    System.setProperty("line.separator", "\n");
  }
  
  @Test
  public void testParsingAndValidation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello foo!");
      _builder.newLine();
      _builder.append("Hello bar!");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
