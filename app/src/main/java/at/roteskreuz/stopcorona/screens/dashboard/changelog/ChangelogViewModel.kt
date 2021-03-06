package at.roteskreuz.stopcorona.screens.dashboard.changelog

import at.roteskreuz.stopcorona.model.managers.Changelog
import at.roteskreuz.stopcorona.model.managers.ChangelogManager
import at.roteskreuz.stopcorona.skeleton.core.model.helpers.AppDispatchers
import at.roteskreuz.stopcorona.skeleton.core.screens.base.viewmodel.ScopedViewModel

class ChangelogViewModel(
    appDispatchers: AppDispatchers,
    private val changelogManager: ChangelogManager
) : ScopedViewModel(appDispatchers) {

    val changelog: Changelog? = changelogManager.currentChangelog

    fun markChangelogAsSeen() {
        changelogManager.markCurrentChangelogAsSeen()
    }
}
