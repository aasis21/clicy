## Clicy :: AstToDot 
Clicy is a plugin for Eclipse that generates [dot](https://en.wikipedia.org/wiki/DOT_(graph_description_language)) graph layout of the Java file AST.  Firstly, the Abstract syntax tree is generated and parsed using eclipse JDT(Java Development Tool) and then converted to dot format. A new file in your eclipse folder containg AST in dot format is written. As of now, dot format contains only the basic information about the java code.

##### Example:
```java
package tranch;

public class hello {
	public static void main(String args[]){
	      int num=70;
	      if( num < 100 ){
			  System.out.println("number is less than 100");
	      }
	 }
}

```
##### Generated File:
```d
digraph G {
573609427[label="CompilationUnit"]1970590475[label="PackageDeclaration"]
573609427->1970590475
1451467558[label="SimpleName\ntranch"]
1970590475->1451467558
341265631[label="TypeDeclaration"]
573609427->341265631
1084922798[label="Modifier\npublic"]
341265631->1084922798
1443373883[label="SimpleName\nhello"]
341265631->1443373883
1764032387[label="MethodDeclaration"]
341265631->1764032387
1857357520[label="Modifier\npublic"]
1764032387->1857357520
2041835974[label="Modifier\nstatic"]
1764032387->2041835974
326612927[label="PrimitiveType"]
1764032387->326612927
236556430[label="SimpleName\nmain"]
1764032387->236556430
624536385[label="SingleVariableDeclaration"]
1764032387->624536385
172682435[label="SimpleType"]
624536385->172682435
1730372207[label="SimpleName\nString"]
172682435->1730372207
1509267978[label="SimpleName\nargs"]
624536385->1509267978
63706253[label="Dimension"]
624536385->63706253
388991153[label="Block"]
1764032387->388991153
1374330626[label="VariableDeclarationStatement"]
388991153->1374330626
949292363[label="PrimitiveType"]
1374330626->949292363
1962559633[label="VariableDeclarationFragment"]
1374330626->1962559633
673470521[label="SimpleName\nnum"]
1962559633->673470521
2080142643[label="NumberLiteral\n70"]
1962559633->2080142643
934377784[label="IfStatement"]
388991153->934377784
855277552[label="InfixExpression"]
934377784->855277552
855429058[label="SimpleName\nnum"]
855277552->855429058
1191377646[label="NumberLiteral\n100"]
855277552->1191377646
1421507391[label="Block"]
934377784->1421507391
1060834073[label="ExpressionStatement"]
1421507391->1060834073
1466779664[label="MethodInvocation"]
1060834073->1466779664
853192721[label="QualifiedName"]
1466779664->853192721
264913810[label="SimpleName\nSystem"]
853192721->264913810
1954526385[label="SimpleName\nout"]
853192721->1954526385
906606834[label="SimpleName\nprintln"]
1466779664->906606834
1658839854[label="StringLiteral\nnumber is less than 100"]
1466779664->1658839854

}
```
##### The corresponding Graph:
![](https://raw.githubusercontent.com/aasis21/Slink-Eclipse-PlugIn/master/foo.png?token=AYNpSAh0vpdEFV-LSXOLpCuqcAe_OOXzks5bXhIkwA%3D%3D)



### Usage 
Right click on the file in Eclipse Package Explorer and then click AstToDot under clicy sub-menu.

### Bugs
The project is in development and done for learning purpose. There may be bugs. 
