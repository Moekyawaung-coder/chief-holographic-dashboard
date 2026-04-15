@Composable
fun AIAdaptiveScaffold(
    userIntent: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val aiEngine = remember { AutonomousAIOrchestrator() }
    val adaptedLayout by aiEngine.adaptLayout(userIntent).collectAsState()

    SeniorCyberTheme {
        Scaffold(
            topBar = { aiEngine.SmartTopBar(adaptedLayout) },
            floatingActionButton = { aiEngine.IntelligentFAB(adaptedLayout) }
        ) { padding ->
            content()
        }
    }
}
