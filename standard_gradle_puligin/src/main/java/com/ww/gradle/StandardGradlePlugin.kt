package com.ww.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project


/**
 * @Author weiwei
 * @Date 2022/7/27 21:37
 */
class StandardGradlePlugin : Plugin<Project> {

    companion object {
        private const val TAG = "WritePluginMetaPlugin"
    }

    override fun apply(project: Project) {
        println("单独项目创建的gradle插件3333")
    }


}