file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/SCS2204/Lab_08/D2.scala
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file:///C:/Users/Abdulla/OneDrive/Desktop/Codes/SCS2204/Lab_08/D2.scala
text:
```scala
object D2{
    def main(args"")
}
```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	dotty.tools.dotc.parsing.Scanners$Scanner.lookahead(Scanners.scala:1087)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClause$$anonfun$1(Parsers.scala:3430)
	dotty.tools.dotc.parsing.Parsers$Parser.enclosedWithCommas(Parsers.scala:598)
	dotty.tools.dotc.parsing.Parsers$Parser.inParensWithCommas(Parsers.scala:611)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClause(Parsers.scala:3446)
	dotty.tools.dotc.parsing.Parsers$Parser.recur$6(Parsers.scala:3460)
	dotty.tools.dotc.parsing.Parsers$Parser.termParamClauses(Parsers.scala:3468)
	dotty.tools.dotc.parsing.Parsers$Parser.defDefOrDcl(Parsers.scala:3764)
	dotty.tools.dotc.parsing.Parsers$Parser.defOrDcl(Parsers.scala:3650)
	dotty.tools.dotc.parsing.Parsers$Parser.templateStatSeq$$anonfun$1(Parsers.scala:4324)
	dotty.tools.dotc.parsing.Parsers$Parser.checkNoEscapingPlaceholders(Parsers.scala:525)
	dotty.tools.dotc.parsing.Parsers$Parser.templateStatSeq(Parsers.scala:4332)
	dotty.tools.dotc.parsing.Parsers$Parser.$anonfun$41(Parsers.scala:4207)
	dotty.tools.dotc.parsing.Parsers$Parser.enclosed(Parsers.scala:589)
	dotty.tools.dotc.parsing.Parsers$Parser.inBraces(Parsers.scala:608)
	dotty.tools.dotc.parsing.Parsers$Parser.inBracesOrIndented(Parsers.scala:622)
	dotty.tools.dotc.parsing.Parsers$Parser.inDefScopeBraces(Parsers.scala:625)
	dotty.tools.dotc.parsing.Parsers$Parser.templateBody(Parsers.scala:4207)
	dotty.tools.dotc.parsing.Parsers$Parser.templateBodyOpt(Parsers.scala:4200)
	dotty.tools.dotc.parsing.Parsers$Parser.template(Parsers.scala:4177)
	dotty.tools.dotc.parsing.Parsers$Parser.templateOpt(Parsers.scala:4189)
	dotty.tools.dotc.parsing.Parsers$Parser.objectDef(Parsers.scala:3927)
	dotty.tools.dotc.parsing.Parsers$Parser.tmplDef(Parsers.scala:3881)
	dotty.tools.dotc.parsing.Parsers$Parser.defOrDcl(Parsers.scala:3656)
	dotty.tools.dotc.parsing.Parsers$Parser.topStatSeq(Parsers.scala:4264)
	dotty.tools.dotc.parsing.Parsers$Parser.topstats$1(Parsers.scala:4448)
	dotty.tools.dotc.parsing.Parsers$Parser.compilationUnit$$anonfun$1(Parsers.scala:4453)
	dotty.tools.dotc.parsing.Parsers$Parser.checkNoEscapingPlaceholders(Parsers.scala:525)
	dotty.tools.dotc.parsing.Parsers$Parser.compilationUnit(Parsers.scala:4458)
	dotty.tools.dotc.parsing.Parsers$Parser.parse(Parsers.scala:198)
	dotty.tools.dotc.parsing.Parser.parse$$anonfun$1(ParserPhase.scala:32)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:477)
	dotty.tools.dotc.parsing.Parser.parse(ParserPhase.scala:40)
	dotty.tools.dotc.parsing.Parser.$anonfun$2(ParserPhase.scala:52)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:684)
	scala.collection.immutable.List$.from(List.scala:681)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:898)
	dotty.tools.dotc.parsing.Parser.runOn(ParserPhase.scala:53)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:315)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1323)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:337)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:350)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:360)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:69)
	dotty.tools.dotc.Run.compileUnits(Run.scala:360)
	dotty.tools.dotc.Run.compileSources(Run.scala:261)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:161)
	dotty.tools.pc.MetalsDriver.run(MetalsDriver.scala:47)
	dotty.tools.pc.PcCollector.<init>(PcCollector.scala:42)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:106)
```
#### Short summary: 

java.lang.AssertionError: assertion failed