/*eslint-env node, jest */
import Generator from '../src/models/generator';

const mockGenerator = {
	type: 'autonomous',
	name: 'Grandma',
	description: 'desc',
	rate: 10,
	baseCost: 10,
	quantity: 0,
	unlockValue: 10
};

describe('generator models', () => {
	test('getCost should update cost based on quantity', () => {
		const generator = new Generator(Object.assign({}, mockGenerator));
		const expected = 10;
		expect(generator.getCost()).toBe(expected);
	});
});
