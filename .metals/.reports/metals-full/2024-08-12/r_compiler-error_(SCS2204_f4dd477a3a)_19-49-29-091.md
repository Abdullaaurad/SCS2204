file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/SCS2204/Lab_08/D2.scala
### dotty.tools.dotc.MissingCoreLibraryException: Could not find package scala from compiler core libraries.
Make sure the compiler core libraries are on the classpath.
   

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/SCS2204/Lab_08/D2.scala
text:
```scala

```



#### Error stacktrace:

```
dotty.tools.dotc.core.Denotations$.select$1(Denotations.scala:1320)
	dotty.tools.dotc.core.Denotations$.recurSimple$1(Denotations.scala:1348)
	dotty.tools.dotc.core.Denotations$.recur$1(Denotations.scala:1350)
	dotty.tools.dotc.core.Denotations$.staticRef(Denotations.scala:1354)
	dotty.tools.dotc.core.Symbols$.requiredPackage(Symbols.scala:928)
	dotty.tools.dotc.core.Definitions.ScalaPackageVal(Definitions.scala:215)
	dotty.tools.dotc.core.Definitions.ScalaPackageClass(Definitions.scala:218)
	dotty.tools.dotc.core.Definitions.AnyClass(Definitions.scala:280)
	dotty.tools.dotc.core.Definitions.syntheticScalaClasses(Definitions.scala:2132)
	dotty.tools.dotc.core.Definitions.syntheticCoreClasses(Definitions.scala:2147)
	dotty.tools.dotc.core.Definitions.init(Definitions.scala:2163)
	dotty.tools.dotc.core.Contexts$ContextBase.initialize(Contexts.scala:900)
	dotty.tools.dotc.core.Contexts$Context.initialize(Contexts.scala:523)
	dotty.tools.dotc.interactive.InteractiveDriver.<init>(InteractiveDriver.scala:41)
	dotty.tools.pc.MetalsDriver.<init>(MetalsDriver.scala:32)
	dotty.tools.pc.ScalaPresentationCompiler.newDriver(ScalaPresentationCompiler.scala:96)
```
#### Short summary: 

dotty.tools.dotc.MissingCoreLibraryException: Could not find package scala from compiler core libraries.
Make sure the compiler core libraries are on the classpath.
   