package com.moowork.gradle.node.variant

class Variant {
    def boolean windows

    /* Node */

    def String nodeExec

    def String npmScriptFile

    def String npxScriptFile

    def File nodeDir

    def File nodeBinDir

    /* NPM */

    def String npmExec

    def String npxExec

    def File npmDir

    def File npmBinDir

    /* Yarn */

    def String yarnExec

    def File yarnDir

    def File yarnBinDir

    /* Dependencies */

    def String archiveDependency

    def String exeDependency
}
