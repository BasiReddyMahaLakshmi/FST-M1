import pytest

num1 = 9
num2 = 6


def test_addition():
    result = num1 + num2
    assert result == 15


def test_subtraction():
    result = num1 - num2
    assert result == 3


def test_product():
    result = num1 * num2
    assert result == 54


def test_quotient():
    result = num1 / num2
    assert result == 1.5
