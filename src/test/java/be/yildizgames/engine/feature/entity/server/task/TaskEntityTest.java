/*
 *
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2018 Grégory Van den Borre
 *
 * More infos available: https://www.yildiz-games.be
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without
 * limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 *
 */

package be.yildizgames.engine.feature.entity.server.task;

import be.yildizgames.common.geometry.Point3D;
import be.yildizgames.common.model.EntityId;
import be.yildizgames.common.model.PlayerId;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Grégory Van den Borre
 */
final class TaskEntityTest {

    @Test
    void testTaskEntity() {
        assertThrows(AssertionError.class, () -> new TaskEntity(null, PlayerId.valueOf(4), Point3D.ZERO, 1, 0));
    }

    @Test
    void testTaskEntity2() {
        assertThrows(AssertionError.class, () -> new TaskEntity(EntityId.valueOf(1L), null, Point3D.ZERO, 1, 0));
    }

    @Test
    void testTaskEntity3() {
        assertThrows(AssertionError.class, () -> new TaskEntity(EntityId.valueOf(1L), PlayerId.valueOf(2), null, 1, 0));
    }

    @Test
    void testTaskEntity4() {
        assertThrows(InvalidParameterException.class, () -> new TaskEntity(EntityId.valueOf(1L), PlayerId.valueOf(2), Point3D.ZERO, -1, 0));
    }

    @Test
    void testTaskEntity5() {
        assertThrows(InvalidParameterException.class, () -> new TaskEntity(EntityId.valueOf(1L), PlayerId.valueOf(2), Point3D.ZERO, 5, -1));
    }

    @Test
    void testTaskEntity6() {
        new TaskEntity(EntityId.valueOf(1L), PlayerId.valueOf(2), Point3D.ZERO, 5, 0);
    }

    @Test
    void testGetEntity() {
        TaskEntity te = new TaskEntity(EntityId.valueOf(1L), PlayerId.valueOf(2), Point3D.valueOf(5), 5, 0);
        assertEquals(EntityId.valueOf(1L), te.getEntity());
        assertEquals(PlayerId.valueOf(2), te.getOwner());
        assertEquals(Point3D.valueOf(5), te.getPosition());
        assertEquals(5, te.getType());
        assertEquals(0, te.getTimeLeft());
    }

}