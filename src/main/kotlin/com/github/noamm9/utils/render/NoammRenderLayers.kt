package com.github.noamm9.utils.render

import it.unimi.dsi.fastutil.doubles.Double2ObjectMap
import it.unimi.dsi.fastutil.doubles.Double2ObjectOpenHashMap
import net.minecraft.client.renderer.rendertype.RenderType
import net.minecraft.client.renderer.rendertype.RenderTypes

object NoammRenderLayers {
    private val linesThroughWallsLayers: Double2ObjectMap<RenderTypes> = Double2ObjectOpenHashMap()
    private val linesLayers: Double2ObjectMap<RenderType> = Double2ObjectOpenHashMap()

    private val LINES_THROUGH_WALLS = RenderTypes.lines()

    private val LINES = RenderTypes.lines()

    val FILLED = RenderTypes.debugFilledBox()

    val FILLED_THROUGH_WALLS = RenderTypes.debugFilledBox()

    fun getLinesThroughWalls(width: Double): RenderType = LINES_THROUGH_WALLS

    fun getLines(width: Double): RenderType = LINES
}
